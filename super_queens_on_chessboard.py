def queensproblem(rows, columns):
    solutions = [[]]
    for row in range(rows):
        solutions = add_one_queen(row, columns, solutions)
    return solutions

def add_one_queen(new_row, columns, prev_solutions):
    return [solution + [new_column]
            for solution in prev_solutions
            for new_column in range(columns)
            if no_conflict(new_row, new_column, solution)]

def no_conflict(new_row, new_column, solution):
    return all(solution[row]       != new_column           and
               solution[row] + row != new_column + new_row and
               solution[row] - row != new_column - new_row and
               solution[row] + 2*row != new_column + 2*new_row and
               solution[row] - 2*row != new_column - 2*new_row and
               solution[row] + row != 2*new_column + new_row and
               solution[row] - row != 2*new_column - new_row
               for row in range(new_row))

n=int(input())
for solution in queensproblem(10, 10):
    print(len(solution))