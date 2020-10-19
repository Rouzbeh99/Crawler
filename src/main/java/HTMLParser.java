import edu.uci.ics.crawler4j.url.WebURL;
import lombok.Builder;
import lombok.Data;
import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

@Data
public class HTMLParser {
    private WebURL url;
    private Document document;

    @Builder
    public HTMLParser(WebURL url) {
        this.url = url;
    }

    @SneakyThrows
    private void loadPage(){
        document = Jsoup.connect(url.getURL()).get();
    }
}
//<div id=app><nav class="ui secondary top fixed navbar menu">
//<a target="_self" class="header item logo" href="/s/chabahar"></a>
//<div class="item city-selector"><div><button class="ui basic icon left labeled button city-label" role="button">
//<i aria-hidden="true" class="angle down icon"></i>چابهار</button></div></div>
//<div class="menu links"><a class="item link" href="/my-divar/my-posts">دیوار من</a>
//<a target="_blank" href="https://chat.divar.ir/" class="item link">چت</a>
//<a class="item link" href="/about">درباره ما</a><a target="_blank" href="https://divar.ir/blog" class="item link">بلاگ</a>
//<a href="https://help.divar.ir" class="item link">پشتیبانی و قوانین</a><a class="item link" href="/contact">تماس با ما</a>
//<div class="item newButton"><a class="ui button buttons buttons--red divari-colored" role="button" href="/new">ثبت رایگان آگهی</a></div>
//<div role="listbox" aria-expanded="false" class="ui dropdown mobile-menu" tabindex="0"><div class="text" role="alert" aria-live="polite"></div><i aria-hidden="true" class="sidebar icon"></i>
//<div class="menu transition"><a role="option" class="item mobileLink" href="/my-divar/my-posts">دیوار من</a>
//<a href="https://chat.divar.ir/" target="_blank" role="option" class="item mobileLink">چت</a><a role="option" class="item mobileLink" href="/about">درباره ما</a>
//<a href="https://divar.ir/blog" target="_blank" role="option" class="item mobileLink">بلاگ</a><a href="https://help.divar.ir" role="option" class="item mobileLink">پشتیبانی و قوانین</a>
//<a role="option" class="item mobileLink" href="/contact">تماس با ما</a></div></div></div></nav><div class="kt-container"><div class="post-breadcrumb"><button class="post-breadcrumb__back" type="button">بازگشت</button>
//<nav aria-label="breadcrumbs">
//<ol class="kt-breadcrumbs kt-breadcrumbs--padded">
//<li class="kt-breadcrumbs__item"><a class="kt-breadcrumbs__link" href="/s/chabahar/real-estate">املاک</a>
//<span class="kt-icon kt-icon-keyboard-arrow-left kt-icon--xs kt-breadcrumbs__icon"></span></li>
//<li class="kt-breadcrumbs__item"><a class="kt-breadcrumbs__link" href="/s/chabahar/buy-residential">فروش مسکونی</a>
//<span class="kt-icon kt-icon-keyboard-arrow-left kt-icon--xs kt-breadcrumbs__icon"></span></li><li class="kt-breadcrumbs__item">
//<a class="kt-breadcrumbs__link" href="/s/chabahar/buy-old-house">زمین و کلنگی</a>
//<span class="kt-icon kt-icon-keyboard-arrow-left kt-icon--xs kt-breadcrumbs__icon"></span></li>
//<li class="kt-breadcrumbs__item">
//<span class="kt-breadcrumbs__link">زمین با یک خونه ۲۵۰متر مربع نوکاباد</span>
//<span class="kt-icon kt-icon-keyboard-arrow-left kt-icon--xs kt-breadcrumbs__icon"></span></li></ol></nav></div>
//<div class="kt-row"><div class="kt-col-5"><div class="post-info"><div class="kt-page-title"><div class="kt-page-title__texts">
//<h1 class="kt-page-title__title kt-page-title__title--responsive-sized">زمین با یک خونه ۲۵۰متر مربع نوکاباد</h1>
//<div class="kt-page-title__subtitle kt-page-title__subtitle--responsive-sized">۱ ساعت پیش در چابهار | فروش زمین و کلنگی</div></div></div>
//<div class="post-actions"><button class="kt-button kt-button--primary post-actions__get-contact" type="button">
//<span class="kt-text-truncate">اطلاعات تماس</span></button>
//<button class="kt-button kt-button--outlined contact-button chat-button" type="button"><span class="kt-text-truncate">چت کنید</span></button>
//<span aria-describedby="post-bookmark" class="bookmark-button"><button class="kt-button kt-button--inlined kt-button--circular" type="button">
//<span class="kt-icon kt-icon-bookmark-o kt-button__icon"></span></button></span><span aria-describedby="post-share" class="share-button"><button class="kt-button kt-button--inlined kt-button--circular" type="button">
//<span class="kt-icon kt-icon-share kt-button__icon"></span></button></span></div>
//<div class="expandable-box expandable-box--collapsed"><div class="copy-row"><div class="kt-base-row kt-unexpandable-row copy-row__content">
//<div class="kt-base-row__start kt-unexpandable-row__title-box"><p class="kt-base-row__title kt-unexpandable-row__title">تلفن</p></div>
//<div class="kt-base-row__end kt-unexpandable-row__value-box"><a class="kt-unexpandable-row__action kt-text-truncate ltr" href="tel:0905071xxxx">۰۹۰۵۰۷۱xxxx</a></div></div>
//<span aria-describedby="tooltip-0905071xxxx" class="copy-row__button"><button class="kt-button kt-button--inlined kt-button--circular" type="button">
//<span class="kt-icon kt-icon-content-copy kt-button__icon"></span></button></span></div>
//<div class="post-statement post-statement--padded"><strong class="post-statement__text post-statement__title">هشدار پلیس</strong>
//<p class="post-statement__text post-statement__description">لطفا پیش از انجام معامله و هر نوع پرداخت وجه، از صحت کالا یا خدمات ارائه شده، به صورت حضوری اطمینان حاصل نمایید.</p></div></div><div><div class="kt-base-row kt-unexpandable-row">
//<div class="kt-base-row__start kt-unexpandable-row__title-box">
//<p class="kt-base-row__title kt-unexpandable-row__title">متراژ</p></div>
//<div class="kt-base-row__end kt-unexpandable-row__value-box">
//<p class="kt-unexpandable-row__value">۲۵۰ متر</p></div></div><hr class="kt-divider"/>
//<div class="kt-base-row kt-unexpandable-row">
//<div class="kt-base-row__start kt-unexpandable-row__title-box">
//<p class="kt-base-row__title kt-unexpandable-row__title">قیمت کل</p></div>
//<div class="kt-base-row__end kt-unexpandable-row__value-box"><p class="kt-unexpandable-row__value">۱۰۰٫۰۰۰٫۰۰۰ تومان</p></div></div>
//<hr class="kt-divider"/><div class="kt-base-row kt-unexpandable-row"><div class="kt-base-row__start kt-unexpandable-row__title-box"><p class="kt-base-row__title kt-unexpandable-row__title">قیمت هر متر</p></div>
//<div class="kt-base-row__end kt-unexpandable-row__value-box"><p class="kt-unexpandable-row__value">۴۰۰٫۰۰۰ تومان</p></div></div>
//<hr class="kt-divider"/><div class="kt-base-row kt-unexpandable-row"><div class="kt-base-row__start kt-unexpandable-row__title-box"><p class="kt-base-row__title kt-unexpandable-row__title">آگهی‌دهنده</p></div>
//<div class="kt-base-row__end kt-unexpandable-row__value-box"><p class="kt-unexpandable-row__value">شخصی</p></div></div><hr class="kt-divider"/></div><div class="kt-section-title"><div><div class="kt-section-title__title-block">
//<span class="kt-section-title__title">توضیحات</span></div></div></div>
//<div class="kt-base-row kt-description-row kt-description-row--padded">
//<div class="kt-base-row__start"><p class="kt-description-row__text post-description kt-description-row__text--primary">شرابط فروشی نقدی یک خانه هم هست