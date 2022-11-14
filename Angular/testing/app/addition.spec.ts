import { Addition } from './addition';

describe('Addition', () => {
  it('should create an instance', () => {
    expect(new Addition()).toBeTruthy();
  });

  it('should return message', () => {
    expect(new Addition().display(4,3)).toEqual(8);
  });
});
