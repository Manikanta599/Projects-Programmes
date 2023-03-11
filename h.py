import hashlib
#print(hashlib.shal("manikanta"))

m=hashlib.md5("manikanta")
n=m.hexdigest()
print(n)