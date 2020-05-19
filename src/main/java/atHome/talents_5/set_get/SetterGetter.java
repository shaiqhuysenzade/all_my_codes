package atHome.talents_5.set_get;

public class SetterGetter {
    private int array[];

    public int[] getArray(){
        return array;
    }

    public void setArray(int a[]){
        this.array=new int[a.length];
        System.arraycopy(a,0,this.array,0,array.length);
    }

    public void displayScores() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }
}
