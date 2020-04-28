#include<iostream>
#include<sstream>
#include<fstream>
#include<vector>
#include<unordered_map>
#include<unordered_set>
#include<deque>
using namespace std;
unordered_map<int,int> calcule(unordered_map<int,unordered_set<int> >& defs,int vec,int bt){
    int u,v,j;
    deque<int> dq;
    dq.push_back(bt);

    std::unordered_set<int> unvisited;
    for(j = 1;j<vec+1;j++)
        unvisited.insert(j);
    unvisited.erase(bt);

    std::unordered_map<int,int> res;
    res[bt] = 0;
    while(dq.size() != 0){
        v = dq.front();
        dq.pop_front();

        std::vector<int> rmv;
        for(auto i = unvisited.begin();i!=unvisited.end();i++){
            u = *i;
            if(defs[v].find(u) == defs[v].end()){
                dq.push_back(u);
                res[u] = res[v] + 1;
                rmv.push_back(u);
            }
        }
        for(auto i = rmv.begin();i!=rmv.end();i++){
            unvisited.erase(*i);
        }
    }
    return res;
}
int main(){
    int cas,i,j;
    cin >> cas;
    for(i=0;i<cas;i++){
        int vec,el,a,b,bt;
        cin >> vec >> el;
        std::unordered_map<int,std::unordered_set<int> > defs;
        for(j=0;j<el;j++){
            cin >> a >> b;
            defs[a].insert(b);
            defs[b].insert(a);
        }

        cin >> bt;
        auto res = calcule(defs,vec,bt);

        for(j=0;j<vec+1;j++){
            if(j != bt && j>0)
                std::cout<<res[j]<<" ";
        }
        printf("\n");
    }
    return 0;
}
