package shape;

import exceptions.InvelidSidesException;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    public static Square create(double side) throws InvelidSidesException {
        if(side <= 0) {
            throw new InvelidSidesException();
        }
        return new Square(side);
    }

}
