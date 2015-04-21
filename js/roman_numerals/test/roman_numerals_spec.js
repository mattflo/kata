var chai = require('chai');
chai.should();

var roman = function (digit) {
  if (digit == 'i') {
    return 1;
  } else {
    return 5;
  }
};

describe('roman numerals',function(){
  describe('digits', function(){
    it('i should be 1', function(){
      roman('i').should.equal(1);
    })
    it('v should be 5', function(){
      roman('v').should.equal(5);
    })
  })
});

