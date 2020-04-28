package com.tests;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Student {
	private Integer token;
	private String fname;
	private Double cgpa;
	public Student(Integer id, String fname, Double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public Integer getToken() {
		return token;
	}
	public String getFname() {
		return fname;
	}
	public Double getCgpa() {
		return cgpa;
	}
}
public class JavaPriorityQueue {
	public static void main(String[] args) {
		Scanner bi = new Scanner(System.in);
		Comparator<Student> comp_cgpa = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getCgpa().compareTo(o2.getCgpa())*(-1);
			}			
		};
		Comparator<Student> comp_name = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getFname().compareTo(o2.getFname());
			}			
		};
		Comparator<Student> comp_token = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getToken().compareTo(o2.getToken());
			}			
		};
		int n = Integer.parseInt(bi.nextLine());
		Queue<Student> pq_cgpa = new PriorityQueue<>(n,comp_cgpa);
		Queue<Student> pq_name = new PriorityQueue<>(n,comp_name);
		Queue<Student> pq_token = new PriorityQueue<>(n,comp_token);		
		while (n-- > 0) {
			String[] q = bi.nextLine().replace("  ", " ").trim().split(" ");			
			if (q[0].equals("ENTER")) {
				Student std = new Student(Integer.parseInt(q[3]), 
						q[1].trim(), Double.parseDouble(q[2]));
				pq_cgpa.add(std);
				pq_name.add(std);
				pq_token.add(std);
			} else if (q[0].equals("SERVED")) {
				Supplier<Stream<Student>> tmp = () -> pq_cgpa.stream()
						.filter(x -> x.getCgpa().equals(pq_cgpa.peek().getCgpa()));
				long cnt = tmp.get().count(); 
				if (cnt==1) {
					Student std = pq_cgpa.poll();
					pq_name.remove(std);
					pq_token.remove(std);						
				} else if (cnt>1){
					final Queue<Student> qu = tmp.get().collect(Collectors.toCollection(() -> new PriorityQueue<Student>(comp_name)));	
					long dsize = qu.stream()
							.filter(x -> x.getFname().equals(pq_cgpa.peek().getFname())).count();
					if (qu.size()==dsize) {
						final Queue<Student> qt = tmp.get().collect(Collectors.toCollection(() -> new PriorityQueue<Student>(comp_token)));
						Student std = qt.poll();
						pq_cgpa.remove(std);
						pq_token.remove(std);	
						pq_name.remove(std);														
					}
					else {					
						Student std = qu.poll();
						pq_cgpa.remove(std);
						pq_token.remove(std);	
						pq_name.remove(std);						
					}
				}
			}
		}
		 if (pq_cgpa.size()>0) {
				while (pq_cgpa.size()>0) {
					Student std = null;
					Supplier<Stream<Student>> tmp = () -> pq_cgpa.stream()
							.filter(x -> x.getCgpa().equals(pq_cgpa.peek().getCgpa()));
					long cnt = tmp.get().count(); 
					if (cnt==1) {
						std = pq_cgpa.poll();
						pq_name.remove(std);
						pq_token.remove(std);						
					} else if (cnt>1){
						final Queue<Student> qu = tmp.get().collect(Collectors.toCollection(() -> new PriorityQueue<Student>(comp_name)));	
						long dsize = qu.stream()
								.filter(x -> x.getFname().equals(pq_cgpa.peek().getFname())).count();
						if (qu.size()==dsize) {
							final Queue<Student> qt = tmp.get().collect(Collectors.toCollection(() -> new PriorityQueue<Student>(comp_token)));
							std = qt.poll();
							pq_cgpa.remove(std);
							pq_token.remove(std);	
							pq_name.remove(std);														
						}
						else {					
							std = qu.poll();
							pq_cgpa.remove(std);
							pq_token.remove(std);	
							pq_name.remove(std);						
						}
					}
					System.out.println(std.getFname());
				}
		} else System.out.println("EMPTY");
	}
}
