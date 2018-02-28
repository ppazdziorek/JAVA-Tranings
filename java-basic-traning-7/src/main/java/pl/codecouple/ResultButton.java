package pl.codecouple;

import java.util.Random;

class ResultButton {

    int getValue() {
        return new Random().nextInt(100) + 1;
    }

}
