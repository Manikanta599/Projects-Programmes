import hashlib
#create a block class

class Block:
    #create a constructor for block class
    def __init__(self,data,prev_hash):
        self.data=data
        self.prev_hash=prev_hash
        self.hash=self.calc_hash()



    #create a method that caliculates the hash using SHA-256
    def calc_hash(self):
        sha=hashlib.sha256()
        sha.update(self.data.encode('utf-8'))
        return sha.hexidigest()

        


    
