from collections import deque
from sys import stdin,stdout
import math 

AdjList = [] 
def init_trie(keywords):   
    create_empty_trie()
    add_keywords(keywords)
    set_fail_transitions()     
def create_empty_trie():
    AdjList.append({'value':'', 'next_states':[],'fail_state':0,'output':[]})
def add_keywords(keywords):
    for keyword in keywords:
        add_keyword(keyword)        
def find_next_state(current_state, value):
    for node in AdjList[current_state]["next_states"]:
        if AdjList[node]["value"] == value:
            return node
    return None
def add_keyword(keyword):
    current_state = 0
    j = 0
    keyword = keyword.lower()
    child = find_next_state(current_state, keyword[j])
    while child != None:
        current_state = child
        j = j + 1
        if j < len(keyword):
            child = find_next_state(current_state, keyword[j])
        else:
            break
    for i in range(j, len(keyword)):
        node = {'value':keyword[i],'next_states':[],'fail_state':0,'output':[]}
        AdjList.append(node)
        AdjList[current_state]["next_states"].append(len(AdjList) - 1)
        current_state = len(AdjList) - 1
    AdjList[current_state]["output"].append(keyword)    
def set_fail_transitions():
    q = deque()
    child = 0
    for node in AdjList[0]["next_states"]:
        q.append(node)
        AdjList[node]["fail_state"] = 0
    while q:
        r = q.popleft()
        for child in AdjList[r]["next_states"]:
            q.append(child)
            state = AdjList[r]["fail_state"]
            while find_next_state(state, AdjList[child]["value"]) == None \
            and state != 0:
                state = AdjList[state]["fail_state"]
            AdjList[child]["fail_state"] = find_next_state(state,AdjList[child]["value"])
            if AdjList[child]["fail_state"] is None:
                AdjList[child]["fail_state"] = 0
            AdjList[child]["output"] = AdjList[child]["output"] + AdjList[AdjList[child]["fail_state"]]["output"]
def get_keywords_found(line):    
    line = line.lower()
    current_state = 0
    keywords_found = []
    count_words=0     
    for i in range(len(line)):
        while find_next_state(current_state, line[i]) is None and current_state != 0:
            current_state = AdjList[current_state]["fail_state"]
        current_state = find_next_state(current_state, line[i])
        if current_state is None:
            current_state = 0
        else:
            for j in AdjList[current_state]["output"]:
                count_words+=1
    return count_words
T = int(stdin.readline())
l=[str(2**x) for x in range(0,801)]
init_trie(l)
while T>0:
    stdout.write(str(get_keywords_found(stdin.readline()))+'\n')
    T-=1