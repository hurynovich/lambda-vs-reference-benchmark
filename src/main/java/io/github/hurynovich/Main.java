package io.github.hurynovich;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Main {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(BaselineBenchmark.class.getSimpleName())
                .include(InstantiationAndCallBenchmark.class.getSimpleName())
                .include(InstantiationAndCallOfStaticBenchmark.class.getSimpleName())
                .include(InstantiationBenchmark.class.getSimpleName())
                .include(InstantiationOfStaticBenchmark.class.getSimpleName())
                .include(CallBenchmark.class.getSimpleName())
                .include(CallOfStaticBenchmark.class.getSimpleName())
                .build();
        new Runner(opt).run();
    }
}