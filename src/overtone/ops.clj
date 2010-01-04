(ns overtone.ops)

(def UNARY-OPS
  {"neg" 0
   "bitNot" 4
   "abs" 5
   "asFloat" 6
   "ceil" 8
   "floor" 9
   "frac" 10
   "sign" 11
   "squared" 12
   "cubed" 13
   "sqrt" 14
   "exp" 15
   "reciprocal" 16
   "midicps" 17
   "cpsmidi" 18
   "midiratio" 19
   "ratiomidi" 20
   "dbamp" 21
   "ampdb" 22
   "octcps" 23
   "cpsoct" 24
   "log" 25
   "log2" 26
   "log10" 27
   "sin" 28
   "cos" 29
   "tam" 30
   "asin" 31
   "acos" 32
   "atan" 33
   "sinh" 34
   "cosh" 35
   "tanh" 36
   "rand" 37
   "rand2" 38
   "linrand" 39
   "bilinrand" 40
   "sum3rand" 41
   "distort" 42
   "softclip" 43
   "coin" 44
   "rectWindow" 48
   "hanWindow" 49
   "welWindow" 50
   "triWindow" 51
   "ramp" 52
   "scurve" 53})

(def BINARY-OPS 
  (apply hash-map ["+" 0
   "-" 1
   "*" 2
   "div" 3
   "/" 4
   "mod" 5
   "<=" 10
   ">=" 11
   "minimum" 12
   "maximum" 13 
   "lcm" 17
   "gcd" 18
   "round" 19
   "roundUp" 20
   "trunc" 21
   "atan2" 22
   "hypot" 23
   "hypotApx" 24
   "pow" 25
   "leftShift" 26
   "rightShift" 27
   "unsignedRightShift" 28
   "ring1" 30
   "ring2" 31
   "ring3" 32
   "ring4" 33
   "difsqr" 34
   "sumsqr" 35
   "sqrsum" 36
   "sqrdif" 37
   "absdif" 38
   "thresh" 39
   "amclip" 40
   "scaleneg" 41
   "clip2" 42
   "excess" 43
   "fold2" 44
   "wrap2" 45
   "rrand" 47
   "exprand" 48]))

(defn unary-op-num [name]
  (get UNARY-OPS (str name) false))

(defn binary-op-num [name]
  (get BINARY-OPS (str name) false))

