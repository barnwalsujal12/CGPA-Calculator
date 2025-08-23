public class CGPACalculator{
    public static String CGPACalc(String[] grades,int[] credits){
    int n=0;
 boolean hasFail=false;
    int sum=0;
    for (int i:credits){
        sum+=i;
    }
        for (int i=0;i<grades.length;i++){
          String g=grades[i] ;int c=credits[i]; 
        switch(g){
        case "A+":
        n+=(10*c);break;
        case "A":
        n+=(9*c);break;
        case "B+":
        n+=(8*c);break;
        case "B":
        n+=(7*c);break;
        case "C+":
        n+=(6*c);break;
        case "C":
        n+=(5*c);break;
        case "F":
    hasFail=true;break;
        }}
        if (hasFail){ System.out.println("PROMOTED");}
        else {System.out.println("PASSED PROMOTED");}
        Double cgpa=Math.round((n/(sum*1.0))*100.0)/100.0;
        return cgpa.toString()+" CGPA";
    }
    
    public static void main(String ...args){
        String[] grades={"B+","B+","B+","B","A","A","B+","A+","A","A","A+","A+"};
        String[] grades1={"C+","C","C+","B","B+","A","A","A+","A","A+","A+","A+" };
        int[] credits={4,2,2,1,1,1,1,1,4,2,1,1};
     System.out.println(CGPACalc(grades,credits));
    }
}