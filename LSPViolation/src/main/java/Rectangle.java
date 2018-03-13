public class Rectangle
{
    protected int width;
    protected int height;

    public void setWidth(int width){
        width = width;
    }

    public void setHeight(int height){
        height = height;
    }


    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getArea(){
        return width * height;
    }
}
