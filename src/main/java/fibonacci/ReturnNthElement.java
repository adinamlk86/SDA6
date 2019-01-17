package fibonacci;

public class ReturnNthElement {

    public int getTerm(int position) {

        if (position == 0 || position == 1) {
            return position;
        }

        return getTerm(position-1)+ getTerm(position -2);

    }
}