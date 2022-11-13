package io.github.hurynovich;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

public class BaselineBenchmark extends AbstractBenchmark {

    @Benchmark
    @Warmup(iterations = 0)
    public void baseline(Blackhole bh) {
        // this method was intentionally left blank.
    }
}
