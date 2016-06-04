import sys
import urlparse
par = urlparse.urlparse(sys.stdin.readline().strip()).query
username = par[par.find('username'):par.find('pwd')][:-1].replace('username=','username: ')
pwd = par[par.find('pwd'):par.find('profile')][:-1].replace('pwd=','pwd: ')
profile = par[par.find('profile'):par.find('role')][:-1].replace('profile=','profile: ')
role = par[par.find('role'):par.find('key')][:-1].replace('role=','role: ')
key = par[par.find('key'):].replace('key=','key: ')
print (username)
print (pwd)
print (profile)
print (role)
print (key)


            