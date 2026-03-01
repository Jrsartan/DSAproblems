class sortprob1{
    public static void main(String args[]){
        byte ascii[]={71,70,71};

        String fistSting=new String(ascii);
        System.out.println(fistSting);

        String secondString=new String(ascii,1,2);
        System.out.println(secondString);
    }
}