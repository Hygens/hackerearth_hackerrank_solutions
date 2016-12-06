# Original text:
# 
# Why did the chicken cross the road?
# Gb trg gb gur bgure fvqr!
# 
# On application of ROT13,
# 
# Jul qvq gur puvpxra pebff gur ebnq?
# To get to the other side!


def rot13(secret_messages)
  secret_messages.map{|s| echo s | tr 'A-Za-z' 'N-ZA-Mn-za-m'}
end