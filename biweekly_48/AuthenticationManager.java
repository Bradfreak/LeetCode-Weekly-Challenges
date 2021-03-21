//Design Authentication Manager
class AuthenticationManager {
    HashMap<String,Integer> manage;
    int til;
    public AuthenticationManager(int timeToLive) {
        manage = new HashMap<String,Integer>();
        til = timeToLive;
    }
    
    public void generate(String tokenId, int currentTime) {
        manage.put(tokenId,currentTime+til);
    }
    
    public void renew(String tokenId, int currentTime) {
        if(!manage.containsKey(tokenId)){return;}
        if(manage.get(tokenId) > currentTime){manage.put(tokenId,currentTime+til);}
        else{manage.remove(tokenId);}
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for (Map.Entry<String, Integer> e : manage.entrySet()){
            if(e.getValue() > currentTime){count++;}
        } 
        return count;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */
