package io.github.hurynovich;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

import java.util.function.Supplier;

public class InstantiationAndCallBenchmark extends AbstractBenchmark {

    @Benchmark
    public void lambdaWrapper(Blackhole hole) {
        Supplier<String> s = () -> payload.getData();
        hole.consume(s);
        hole.consume(s.get());
    }

    @Benchmark
    public void methodReference(Blackhole hole) {
        Supplier<String> s = payload::getData;
        hole.consume(s);
        hole.consume(s.get());
    }

}
