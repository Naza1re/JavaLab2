public class Treeangel {
    double  s1, s2, s3;
    Treeangel(Point A, Point B, Point C, Point X){
    }
    Treeangel(){}

    String belong(Point A, Point B, Point C, Point X) {

        s1 = (A.getX()-X.getX())*(B.getY()-A.getY())-(B.getX()-A.getX())*(A.getY()-X.getY());
        s2 = (B.getX()-X.getX())*(C.getY()-B.getY())-(C.getX()-B.getX())*(B.getY()-X.getY());
        s3 = (C.getX()-X.getX())*(A.getY()-C.getY())-(A.getX()-C.getX())*(C.getY()-X.getY());

            if(s1>=0 && s2>=0&&s3>=0){
                return "Точка принадлежит";
            }
            else {
                return "Точка не принадлежит";
            }


    }
}

