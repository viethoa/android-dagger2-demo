This repo is a demo [How to using Dagger 2](#) in android with [Subcomponent](#).

SetUp Modules
-----
```@Module
public class ModuleA {
    @Provides
    public SomeClassA1 provideSomeClassA1() {
        return new SomeClassA1();
    }
}

@Module
public class ModuleB {
    @Provides
    public SomeClassB1 provideSomeClassB1(SomeClassA1 someClassA1) {
        return new SomeClassB1(someClassA1);
    }
}
```

SetUp Components
-----
```@Component(modules = {ModuleA.class, ModuleB.class})
public interface ComponentA {
    ComponentB componentB(ModuleB moduleB);
}

@Subcomponent(modules = ModuleB.class)
public interface ComponentB {
    SomeClassB1 someClassB1();
}

public static void main(String[] args) {
    ModuleA moduleA = new ModuleA();
    ModuleB moduleB = new ModuleB();
    ComponentA componentA = DaggerSubComponent_ComponentA.builder()
            .moduleA(moduleA)
            .moduleB(moduleB)
            .build();

    ComponentB componentB = componentA.componentB(moduleB);
}
```