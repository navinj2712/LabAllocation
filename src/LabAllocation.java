public class LabAllocation {
    public String lab(int lab1, int lab2, int lab3, int num){
        int x = lab1 / num;
        int y = lab2 / num;
        int z = lab3 / num;
        String result = "";

        int min = Math.min(x, Math.min(y, z));
        //System.out.println(min);
        if(min == x) result = "lab1";
        else if(min == y) result = "lab2";
        else result = "lab3";

        return result;
    }
}
