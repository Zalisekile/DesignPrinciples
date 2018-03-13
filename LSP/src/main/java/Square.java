public class Square extends Shape
{
    public void setWidth(int width){
        super.width = width;
        super.height = width;
    }

    public void setHeight(int height)
    {
        super.width = height;
        super.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(){
        return width * height;
    }
}
