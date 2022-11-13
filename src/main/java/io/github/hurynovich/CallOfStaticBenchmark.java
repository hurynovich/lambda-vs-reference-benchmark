package io.github.hurynovich;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

public class CallOfStaticBenchmark extends AbstractBenchmark {

    @Benchmark
    public void methodReference(Blackhole hole) {
        hole.consume(methodReferenceOfStatic.get());
    }

    @Benchmark
    public void lambdaWrapper(Blackhole hole) {
        hole.consume(lambdaWrapperOfStatic.get());
    }

}
