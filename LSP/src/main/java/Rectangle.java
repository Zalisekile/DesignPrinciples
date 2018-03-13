public abstract class  Rectangle extends Shape
{


    public void setWidth(int width)
    {
        this.width = width;
    }


    public void setHeight(int height)
    {
        this.height = height;
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
