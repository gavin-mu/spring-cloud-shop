package quick.pager.shop.mapper;

import org.apache.ibatis.annotations.Param;
import quick.pager.shop.model.SmsTemplate;

import java.util.List;

public interface SmsTemplateMapper {

    int insertSelective(SmsTemplate record);

    SmsTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsTemplate record);

    /**
     * 根据模块查询短信模板
     */
    List<SmsTemplate> selectByModule(@Param("module") String module, @Param("smsTemplateCode") String smsTemplateCode);
}
