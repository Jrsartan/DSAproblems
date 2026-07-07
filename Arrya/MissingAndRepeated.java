class Miss_Repeat_Num{
    public void MissRepeatNumArr(int arr[]){
        int len=arr.length;
        int missing=-1;
        int repeativ=-1;
        for(int i=0;i<=len-1;i++){
            int cnt=0;
            for(int j=0;j<len;j++){
                if(arr[j]==i){
                    cnt++;
                }
            }
                if(cnt==2){
                    System.out.println("A number is Repeatetiv:"+i);
                }
                else if(cnt==0){
                    System.out.println("A number is Missing:"+i);
                }
            }
    }
}
public class MissingAndRepeated {
    public static void main(String[] args){
     int arr[]={0,1,2,5,6,3,8,7,3};
     Miss_Repeat_Num mrnum = new Miss_Repeat_Num();
     mrnum.MissRepeatNumArr(arr);
    }
}
