class Main {
    public static void main(String[] args) {
        String word = " Welcome to git";
        String [] rev =  word.split(" ");
        
        for(int i =0;i< rev.length;i++){
            for(int j= rev[i].length()-1;j>=0;j--){
             System.out.print(rev[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
