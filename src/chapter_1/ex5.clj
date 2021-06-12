(ns chapter-1.ex5)

;;; If Ben uses an applicative-order interpreter the expression
;;; (test 0 (p)) will evaluate forever, recursively evaluating the
;;; operand (p) to no end. If Ben is uses a normal-order interpreter,
;;; the evaluation will return 0 since (p) will never have to be
;;; evaluated due to the short-circuited if conditional.
