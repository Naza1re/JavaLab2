

public class Treeangle {

    Treeangle(Point A,Point B,Point c)
    {

    }

    double MidlX(Point A,Point B,Point C)
    {
         return ((A.GetX()+B.GetX()+C.GetX())/3);


    }
    double MidlY(Point A,Point B,Point C)
    {
        return  ((A.GetY()+B.GetY()+C.GetY())/3);

    }
    double SideAB(Point A,Point B,Point C) // метод нахождения стороны AB треугольнкиа
    {
       return Math.sqrt(Math.pow(B.GetX()-A.GetX(),2)+Math.pow(B.GetY()-A.GetY(),2));

    }


    double SideBC(Point A,Point B,Point C)  // метод нахождения стороны BC треугольнкиа
    {
        return Math.sqrt(Math.pow(C.GetX()-B.GetX(),2)+Math.pow(C.GetY()-B.GetY(),2));
    }


    double SideCA(Point A,Point B,Point C)   // метод нахождения стороны CA треугольнкиа
    {
        return Math.sqrt(Math.pow(C.GetX()-A.GetX(),2)+Math.pow(C.GetY()-A.GetY(),2));
    }

    double PER(Point A,Point B,Point C)
    {

        return (Math.sqrt(Math.pow(C.GetX()-A.GetX(),2)+Math.pow(C.GetY()-A.GetY(),2))+Math.sqrt(Math.pow(C.GetX()-B.GetX(),2)+Math.pow(C.GetY()-B.GetY(),2))+Math.sqrt(Math.pow(B.GetX()-A.GetX(),2)+Math.pow(B.GetY()-A.GetY(),2)));
    }






}

