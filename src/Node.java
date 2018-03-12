/**
 * 
 * @author Estudiante
 */
public class Node
{
    
    String grade;
    double value;
    
    Node next;

    public Node() {
    }

    public Node(String grade, double value) 
    {
        this.grade = grade;
        this.value = value;
    }
    
    public String ToString()
    {
        return "Grade: " + this.grade + "\tValue: " + this.value + "\n";
    }
    
    public Node clone()
    {
         return  new Node(this.grade,this.value);
        
    }
    
}
