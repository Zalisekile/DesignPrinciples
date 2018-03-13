public class GraphicCreator
{
    public void drawShape(Shape s)
    {
        if(s.numberOfSides == 0)
        {
            drawCircle(s);
        }

        if(s.numberOfSides == 4)
        {
            drawRectangle(s);
        }
    }

    public void drawCircle(Shape s)
    {
        System.out.print("drawing The circle");
    }

    public void drawRectangle(Shape s)
    {
        System.out.print("drawing The rectangle");
    }
}
