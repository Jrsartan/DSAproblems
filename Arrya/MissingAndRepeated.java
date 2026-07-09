class Miss_Repeat_Num{
    public void MissRepeatNumArr(int arr[]){
        int len=arr.length;
        int missing=-1;
        int repeativ=-1;
        for(int i=1;i<=len;i++){
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
    public void findMissingAndRepeating(int arr[]) {

    int len = arr.length;

    long SN = (long) len * (len + 1) / 2;
    long S2N = (long) len * (len + 1) * (2 * len + 1) / 6;

    long s = 0;
    long s2 = 0;

    for (int i = 0; i < len; i++) {
        s += arr[i];
        s2 += (long) arr[i] * arr[i];
    }

    long val1 = s - SN;
    long val2 = s2 - S2N;

    val2 = val2 / val1;

    long x = (val1 + val2) / 2;
    long y = x - val1;

    System.out.println("Repeating Number = " + x);
    System.out.println("Missing Number = " + y);
}
}
public class MissingAndRepeated {
    public static void main(String[] args){
     int arr[]={1,2,5,6,3,8,7,3};
     Miss_Repeat_Num mrnum = new Miss_Repeat_Num();
     mrnum.MissRepeatNumArr(arr);
     mrnum.findMissingAndRepeating(arr);
    }
}
