package com.quanr;

/**
 * Created by hujing.huang on 2016/3/8.
 */
interface Valuable {
    double getMoney();
}

interface Protectable{
    double getMoney();
}

class GoldenMonkey implements Valuable,Protectable{

    @Override
    public double getMoney() {
        return 1.0;
    }


}
