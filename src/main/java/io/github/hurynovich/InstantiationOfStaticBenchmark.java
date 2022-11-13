package io.github.hurynovich;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

import java.util.function.Supplier;

public class InstantiationOfStaticBenchmark extends AbstractBenchmark {

    @Benchmark
    public void lambdaWrapper(Blackhole hole) {
        Supplier<String> s = () -> SimplePayload.getDataByStatic();
        hole.consume(s);
    }

    @Benchmark
    public void methodReference(Blackhole hole) {
        Supplier<String> s = SimplePayload::getDataByStatic;
        hole.consume(s);
    }

}
