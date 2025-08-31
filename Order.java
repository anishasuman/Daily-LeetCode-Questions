class Order {
    public int[] recoverOrder(int[] order, int[] friends) {
        int c = 0; //c = count
          for(int i = 0 ; i < order.length ; i++){
              for(int j = 0 ; j < friends.length; j++){
                  //dono array ka element match hua then c++
                  if(order[i] == friends[j]){
                      c++;
                  }
              }
          }
          //creating result array
        int[] ans = new int[c];
          int k = 0;
          
          //same traverse krenge bass result = order mila tho k me store krenge
        for(int i = 0 ; i < order.length ; i++){
            for(int j = 0 ; j < friends.length; j++){
                //dono array ka element match hua then c++
                if(order[i] == friends[j]){
                    ans[k] = order[i];
                    k++;
                }
            }
        }
        return ans; //final answer return krenge 
    }
}
    
