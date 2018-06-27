public class Figure
{
    public String type;
    public String color;

    /*
    Constructor method
     */
    public Figure(String a)
    {
        type = a;
    }

    public static Figure addFigure(String a)
    {
        Figure add = new Figure(a);
        return add;
    }

}
