module com.design {
    exports com.design.api.strategy;
    exports com.design.api.adapter;
    uses com.design.api.adapter.Dog;
    provides com.design.api.adapter.Dog with com.design.imp.adapter.DogType1;
    uses com.design.api.strategy.DuckView;
    provides com.design.api.strategy.DuckView with com.design.imp.strategy.DuckType1;
    


}