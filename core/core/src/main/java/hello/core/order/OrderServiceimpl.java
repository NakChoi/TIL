package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;

public class OrderServiceimpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;


    public OrderServiceimpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice); // SRP 을 잘지킨 예이다. 오더 서비스 입장에서는 디스카운트에 책임이 없다.
                                                                        // SRP를 잘 지켰기 때문에 만약 할인 정책이 바껴도 할인쪽만 바꾸면 된다!
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
