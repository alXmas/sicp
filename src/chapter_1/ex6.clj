This would fall into a dead loop.

Different from evaluation of the special form cond, the function call requires every parameter to be evaluated.

There is only one exit in the sqrt-iter, which calls sqrt-iter itself, result in a dead loop.
