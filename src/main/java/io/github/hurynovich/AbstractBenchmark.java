package io.github.hurynovich;

import org.openjdk.jmh.annotations.*;

import java.util.function.Supplier;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

@Fork(1)
@BenchmarkMode({})
@OutputTimeUnit(MILLISECONDS)
@Warmup(iterations = 1, time = 3)
@Measurement(iterations = 20, time = 500, timeUnit = MILLISECONDS)
@State(Scope.Thread)
public abstract class AbstractBenchmark {
    final SimplePayload payload = new SimplePayload();
    final Supplier<String> lambdaWrapper = () -> payload.getData();
    final Supplier<String> methodReference =  payload::getData;
    final Supplier<String> lambdaWrapperOfStatic = () -> SimplePayload.getDataByStatic();
    final Supplier<String> methodReferenceOfStatic =  SimplePayload::getDataByStatic;
}
