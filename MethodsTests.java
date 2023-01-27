import static org.junit.Assert.*;
import org.junit.*;

public class MethodsTests {
  @Test 
  public void testSumEvensLength4() {
    int[] input1 = { 12, 13, 7, 2};
    assertEquals(EvensExample.sumEvenIndices(input1), 19);
  }
  @Test 
  public void testSumEvenLength5() {
    int[] input1 = { 12, 13, 7, 2, 33};
    assertEquals(EvensExample.sumEvenIndices(input1), 52);
  }
  @Test
  public void testSumEvenLength6() {
    int[] input1 = { 12, 13, 7, 8, 5, 3};
    assertEquals(EvensExample.sumEvenIndices(input1), 24);
  }

  @Test
  public void testReversedLength3() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[] { 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceLength3() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3, 2, 1 }, input1);
  }

  @Test
  public void testAverageWithoutLowest() {
    double [] input1 = {1,2,3,1};
    assertEquals(2, ArrayExamples.averageWithoutLowest(input1), .00000001);    
  }
}