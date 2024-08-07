
public class HW4_WrittenPortion {
/*
1.Assume we have three int variables i=0, j=5 and k=10. For each of the following
expressions, determine the value of the expression (either true or false) or specify that the
code results in a compiler error.
(a) (i == 0 || j == 0) && k == 0
(b) i == 0 || (j == 0 && k == 0)
(c) i == 0 || j == 0 && k == 0
(d) i = 0 || j = 0 && k = 0
(e) !(j==0 || i == 0)
(f) !(j==0 && i == 0)
(g) !(j==0) && i == 0
(h) !j==0 && i == 0
(i) (j>0) && (j<=5)
(j) (k>0) || (k<=5)

(a) (i == 0 || j == 0) && k == 0 = (T || F) && F = T && F = false
(b) i == 0 || (j == 0 && k == 0) = T || (F && F) = T || F = true
(c) Same as in (b) since && has higher precedence than ||, so the answer is true
(d) Compiler error, since you are using = instead of ==.
(e) !(j==0 || i == 0) = !(F || T) = !(T) = false
(f) !(j==0 && i == 0) = !(F && T) = !(F) = true
(g) !(j==0) && i == 0 = !(F) && T = T && T = true
(h) Compile error. The operator ! can only be applied to boolean values, but because of
precedence it is being applied to the int variable j
(i) (j>0) && (j<=5) = T && T = true
(j) (k>0) || (k<=5) = T || F = true

2.Rewrite the following code so that it uses only simple logical expressions (i.e., it
does not use the logical operators &&, || or !).
if (i == j && !(k > 1))
	m = 0;
else
	m = 1;

if(i == j) {
	if (k <= 1) {
		m = 0;
	else
		m = 1;
}
else
	m = 1;
	
3. Determine if the following two sets of code always behave the same for ALL input.
If your answer is yes, explain why; if you answer is no, give an example where the two codes
behave differently.
n = in.nextInt(); 			n = in.nextInt();
if (n == 0) 				if (n == 0)
n++; 						n++;
if (n > 0) 					else if (n > 0)
n = 2*n; 					n = 2*n;

The two codes behave the same except for one input value: n = 0. When 0 is input, the first
code executes the if-clauses of both if statements, resulting in n ending up with the value 2.
In the second code, only the if-clause is executed (not the else-clause too), so n ends up with
the value 1

4.Write code that reads in two numbers n and m and then shows the quotient and
remainder when dividing n by m using the output format shown below. For example, if the
user types in 55 13 your code should output
55 = 4*13 + 3
If the remainder is 0 then it should not be printed. Two more examples: if the user typs in
255 15 the output should be
255 = 17*15
If the user types in 9876543 21 the output should be
9876543 = 470311*21 + 12

int n = in.nextInt();
int m = in.nextInt();
int q = n/m
int r = /n%m
System.out.print(n + " = " + q + "*" + m);
if(r > 0)
	System.out.print(" + " + r);
System.out.println();

5.Write code which reads in three integers a, b and c and sorts them so that a has
the highest value and c has the lowest value. For example, if initially the values for a, b and
c were 3, 7 and 6, then after the sorting code the values of a, b and c would be 7, 6 and 3.
Note: you should NOT make use of any routines in the Math class – just use if statements.

if (a >= b && a >= c) {
	largest = a;
	if (b > c) {
		middle = b;
		smallest = c;
	} else {
		middle = c;
		smallest = b;
	}
} else if (b >= a && b >= c) {
	largest = b;
	if (a > c) {
		middle = a;
		smallest = c;
	} else {
		middle = c;
		smallest = a;
	}
} else {
	largest = c;
	if (a > b) {
		middle = a;
		smallest = b;
	} else {
		middle = b;
		smallest = a;
	}
}
a = largest;
b = middle;
c = smallest;
*/
}
