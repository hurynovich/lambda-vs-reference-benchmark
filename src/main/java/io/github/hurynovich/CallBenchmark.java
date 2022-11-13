package io.github.hurynovich;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

public class CallBenchmark extends AbstractBenchmark {

    @Benchmark
    public void lambdaWrapper(Blackhole hole) {
        hole.consume(lambdaWrapper.get());
    }

    @Benchmark
    public void methodReference(Blackhole hole) {
        hole.consume(methodReference.get());
    }

}
