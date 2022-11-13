package io.github.hurynovich;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

import java.util.function.Supplier;

public class InstantiationBenchmark extends AbstractBenchmark {

    @Benchmark
    public void lambdaWrapper(Blackhole hole) {
        hole.consume((Supplier<String>) () -> payload.getData());
    }

    @Benchmark
    public void methodReference(Blackhole hole) {
        hole.consume((Supplier<String>) payload::getData);
    }

}
