package algo.arrays;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @ArgumentsSource(TwoSumTestArgumentsProvider.class)
    void testTwoSumSolutionWithBruteForce(int[] nums, int target, int[] expected) {
        int[] result = twoSum.twoSumSolutionWithBruteForce(nums, target);
        assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @ArgumentsSource(TwoSumTestArgumentsProvider.class)
    void testTwoSumSolutionWithMap(int[] nums, int target, int[] expected) {
        int[] result = twoSum.twoSumSolutionWithMap(nums, target);
        assertArrayEquals(expected, result);
    }

}

class TwoSumTestArgumentsProvider implements ArgumentsProvider {

    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{0, 4, 3, 0}, 0, new int[]{0, 3}),
                Arguments.of(new int[]{-1, -2, -3, -4, -5}, -8, new int[]{2, 4})
        );
    }
}