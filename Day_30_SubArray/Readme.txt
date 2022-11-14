We define the following:

    A subarray of an 

-element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like

    would not be a subarray as it's not a contiguous subsection of the original array.
    The sum of an array is the total sum of its elements.
        An array's sum is negative if the total sum of its elements is negative.
        An array's sum is positive if the total sum of its elements is positive.

Given an array of

integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer,
, denoting the length of array .
The second line contains space-separated integers describing each respective element, , in array

.

Constraints

Output Format

Print the number of subarrays of

having negative sums.

Sample Input

5
1 -2 4 -5 1

Sample Output

9

Explanation

There are nine negative subarrays of

:

Thus, we print on a new line.


Input (stdin)

    5

    1 -2 4 -5 1

Expected Output

    9


Input (stdin)

    100

    255 -77 601 89 -993 -307 300 452 -312 400 -993 831 790 236 981 274 167 676 -134 -906 139 -537 -159 483 398 253 583 348 582 481 398 -504 459 39 650 424 511 581 303 142 -300 796 183 -609 432 33 -846 -101 421 602 -789 214 692 -971 212 752 -564 -747 -396 217 448 364 -139 304 -309 337 989 751 698 381 892 -774 34 557 231 612 -377 -677 497 -781 -944 608 21 967 787 -334 835 136 335 -4 -468 -301 -296 65 -664 -303 317 893 624 115

Expected Output

    425

Input (stdin)

    1

    100

Expected Output

    0

