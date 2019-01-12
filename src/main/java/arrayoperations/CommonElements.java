package arrayoperations;

public class CommonElements {
    public static void main(String[] args) {
        int[] prima={23,45,67,89,12,21};
        int[] aDoua={89,45,65,21,85,67};
        for(int i=0;i<prima.length;i++){
            for(int j=0;j<aDoua.length;j++){
                if(prima[i]==aDoua[j]){
                    int elementComun=prima[i];
                    System.out.print(elementComun+" ");
                }
            }
        }
    }
}
