public class QuizScore {
    
    private String typed;

    public QuizScore(String typed){
        this.typed = typed;
    }

    public String getTyped(){
        return typed;
    }

    public Integer getPoints(){
        int b = typed.indexOf('/');
        String a = typed.substring(0, b);
        if (ParseTools.isInteger(a)){
            return Integer.parseInt(a);
        }
        return null;
    }

    public Integer getOutOf(){
         int b = typed.indexOf('/');
        String a = typed.substring(b+1, typed.length());
        if (ParseTools.isInteger(a)){
            return Integer.parseInt(a);
        }
        return null;
    }

    public Double percent(){
        Integer a = getPoints();
        Integer b = getOutOf();
        if (a == null || b == null){
            return null;
        }
        return ((double)a / b) * 100;
    }

    public boolean isPerfect(){
        Integer a = getPoints();
        Integer b = getOutOf();
        if (a == null || b == null){
            return false;
        }
        if (a.equals(b)){
            return true;
        }
        return false;
    }


} 

