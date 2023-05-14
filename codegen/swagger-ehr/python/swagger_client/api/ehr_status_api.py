# coding: utf-8

"""
    EHR API

    <table>     <colgroup>         <col style=\"width: 20%;\">         <col style=\"width: 80%;\">     </colgroup>     <thead>     <tr>         <th colspan=\"2\">© 2018 - 2023 The openEHR Foundation</th>     </tr>     </thead>     <tbody>     <tr>         <td colspan=\"2\">             The <a href=\"https://www.openEHR.org\" target=\"_blank\" rel=\"noopener\">openEHR Foundation</a> is an independent, non-profit foundation, facilitating the sharing of health records by consumers and clinicians via open specifications, clinical models and open platform implementations.         </td>     </tr>     <tr>         <td><strong>Licence</strong></td>         <td><span class=\"image\"><img src=\"https://specifications.openehr.org/images/cc-by-nd-88x31.png\" alt=\"image\"></span> Creative Commons Attribution-NoDerivs 3.0 Unported.             <a href=\"https://creativecommons.org/licenses/by-nd/3.0/\" class=\"bare\">https://creativecommons.org/licenses/by-nd/3.0/</a>         </td>     </tr>     <tr>         <td><strong>Support</strong></td>         <td>Issues: <a href=\"https://specifications.openehr.org/components/ITS/open_issues\" target=\"_blank\" rel=\"noopener\">Problem Reports</a><br>             Web: <a href=\"https://specifications.openehr.org\" target=\"_blank\" rel=\"noopener\">specifications.openEHR.org</a>         </td>     </tr>     </tbody> </table>  ### Amendment Record  <table>     <colgroup>         <col style=\"width: 9%;\">         <col style=\"width: 55%;\">         <col style=\"width: 18%;\">         <col style=\"width: 18%;\">     </colgroup>     <thead>     <tr>         <th>Issue</th>         <th>Details</th>         <th>Raiser, Implementer</th>         <th>Completed</th>     </tr>     </thead>     <tbody>     <tr>         <th colspan=\"4\"><a href=\"https://specifications.openehr.org/releases/ITS-REST/latest\" target=\"_blank\" rel=\"noopener\">Release-1.0.3</a></th>     </tr>     <tr>         <td>5.1</td>         <td><a href=\"https://specifications.openehr.org/tickets/SPECITS-66\" target=\"_blank\" rel=\"noopener\">SPECITS-66</a>:             Migrate REST API specs to OpenAPI Specification</td>         <td>S Iancu</td>         <td>19 Dec 2022</td>     </tr>     <tr>         <th colspan=\"4\"><a href=\"https://specifications.openehr.org/releases/ITS-REST/Release-1.0.2\" target=\"_blank\" rel=\"noopener\">Release-1.0.2</a></th>     </tr>     <tr>         <td>4.2</td>         <td><a href=\"https://specifications.openehr.org/tickets/SPECITS-41\" target=\"_blank\" rel=\"noopener\">SPECITS-41</a>:             Add double quotes to ETag and If-Match headers</td>         <td>S Iancu</td>         <td>21 Mar 2021</td>     </tr>     <tr>         <td>4.1</td>         <td><a href=\"https://specifications.openehr.org/tickets/SPECITS-49\" target=\"_blank\" rel=\"noopener\">SPECITS-49</a>:             Describing Resource Identification; add clarification over getting COMPOSITIONs by with `version_uid` vs `versioned_object_uid`</td>         <td>J Smolka, M Polajnar, S Iancu</td>         <td>08 Mar 2021</td>     </tr>     <tr>         <td>4.0</td>         <td><a href=\"https://specifications.openehr.org/tickets/SPECITS-52\" target=\"_blank\" rel=\"noopener\">SPECITS-52</a>:             Fix wrong example on revision history of the VERSIONED_COMPOSITION and VERSIONED_EHR_STATUS</td>         <td>J Smolka, S Iancu</td>         <td>06 Mar 2021</td>     </tr>     <tr>         <th colspan=\"4\"><a href=\"https://specifications.openehr.org/releases/ITS-REST/Release-1.0.1\" target=\"_blank\" rel=\"noopener\">Release-1.0.1</a></th>     </tr>     <tr>         <td>3.2</td>         <td><a href=\"https://specifications.openehr.org/tickets/SPECITS-38\" target=\"_blank\" rel=\"noopener\">SPECITS-38</a>:             Fix response status code for semantic validation errors (fixes also             <a href=\"https://specifications.openehr.org/tickets/SPECPR-298\" target=\"_blank\" rel=\"noopener\">SPECPR-298</a>)</td>         <td>P Pazos, S Iancu</td>         <td>01 Oct 2019</td>     </tr>     <tr>         <td>3.1</td>         <td><a href=\"https://specifications.openehr.org/tickets/SPECITS-40\" target=\"_blank\" rel=\"noopener\">SPECITS-40</a>:             Fix and improve documentation on EHR (fixes also             <a href=\"https://specifications.openehr.org/tickets/SPECPR-312\" target=\"_blank\" rel=\"noopener\">SPECPR-312</a>)</td>         <td>P Pazos, S Iancu</td>         <td>28 Sep 2019</td>     </tr>     <tr>         <td>3.0</td>         <td><a href=\"https://specifications.openehr.org/tickets/SPECITS-32\" target=\"_blank\" rel=\"noopener\">SPECITS-32</a>: Fix typos and minor documentary errors (fixes             <a href=\"https://specifications.openehr.org/tickets/SPECPR-252\" target=\"_blank\" rel=\"noopener\">SPECPR-253</a>,             <a href=\"https://specifications.openehr.org/tickets/SPECPR-255\" target=\"_blank\" rel=\"noopener\">SPECPR-255</a>,             <a href=\"https://specifications.openehr.org/tickets/SPECPR-298\" target=\"_blank\" rel=\"noopener\">SPECPR-298</a>,             <a href=\"https://specifications.openehr.org/tickets/SPECPR-333\" target=\"_blank\" rel=\"noopener\">SPECPR-333</a>,             <a href=\"https://specifications.openehr.org/tickets/SPECPR-337\" target=\"_blank\" rel=\"noopener\">SPECPR-337</a>)</td>         <td>J Smolka, P Pazos, E Sundvall, T Beale, S Iancu</td>         <td>1 Sep 2019</td>     </tr>     <tr>         <td>2.2</td>         <td><a href=\"https://specifications.openehr.org/tickets/SPECITS-24\" target=\"_blank\" rel=\"noopener\">SPECITS-24</a>: Added changelog</td>         <td>J Smolka, S Iancu</td>         <td>12 May 2019</td>     </tr>     <tr>         <td></td>         <td><a href=\"https://specifications.openehr.org/tickets/SPECITS-25\" target=\"_blank\" rel=\"noopener\">SPECITS-25</a>,             <a href=\"https://specifications.openehr.org/tickets/SPECITS-29\" target=\"_blank\" rel=\"noopener\">SPECITS-29</a>: Change layout and structure</td>         <td>J Smolka, S Iancu</td>         <td>12 May 2019</td>     </tr>     <tr>         <td>2.1</td>         <td>Update links to new openEHR specifications website</td>         <td>S Iancu</td>         <td>16 Dec 2018</td>     </tr>     <tr>         <th colspan=\"4\"><a href=\"https://specifications.openehr.org/releases/ITS-REST/Release-1.0.0\" target=\"_blank\" rel=\"noopener\">Release-1.0.0</a></th>     </tr>     </tbody> </table>   # Intro   ## Acknowledgements  ### Editor - Sebastian Iancu, Architect, Code24, Netherlands  ### Contributors This specification benefited from wide formal and informal input from the openEHR and wider health informatics community. The openEHR Foundation would like to recognise the following people for their contributions. - Birger Haarbrandt, MSc, Peter L. Reichertz Institut for Medical Informatics (PLRI), Germany - Bjørn Næss, DIPS, Norway - Bostjan Lah, Senior Architect, Better, Slovenia - Erik Sundvall, Information Architect at Karolinska University Hospital, Sweden - Heath Frankel, Ocean Informatics, Australia - Ian McNicoll MD, FreshEHR, UK - Jake Smolka, Software Engineer, Better, Slovenia - Matija Polajnar, PhD, Software Engineer, Better, Slovenia - Pablo Pazos Gutierrez, Senior engineer, CaboLabs, Uruguay - Rong Chen MD, PhD, Cambio Healthcare Systems, Sweden - Sebastian Iancu, Architect, Code24, Netherlands - Seref Arikan, MEcon, Ocean Informatics UK, Centre for Health Informatics and Multi-professional Education (CHIME) UK - Thomas Beale, Ars Semantica UK, openEHR Foundation Management Board  ### Trademarks - 'openEHR' is a trademark of the [openEHR Foundation](https://www.openEHR.org) - 'OpenAPI' is a trademark of the [The Linux Foundation](https://www.linuxfoundation.org)   ## Preface  ### Purpose  This specification describes service endpoints, resources and operations as well as details of requests and responses that interacts with EHR openEHR API in a RESTful manner.  ### Related Documents  Prerequisite documents for reading this document include:  - The [EHR Information Model](https://specifications.openehr.org/releases/RM/latest/ehr.html#_the_ehr_information_model)  Related documents include:  - The [openEHR Architecture Overview](https://specifications.openehr.org/releases/BASE/latest/architecture_overview.html) - The [openEHR Global Class Index](https://specifications.openehr.org/classes) - The [XML-Schemas (XSD)](https://specifications.openehr.org/releases/ITS-XML/latest) - The [JSON-Schemas](https://specifications.openehr.org/releases/ITS-JSON/latest) and [Simplified Data Template (SDT)](simplified_data_template.html) - The [openEHR Platform Abstract Service Model](https://specifications.openehr.org/releases/SM/latest/openehr_platform.html)  ### Status  This specification is in the `STABLE` state, and can be downloaded as [OpenAPI specification](https://spec.openapis.org/oas/v3.0.3) file (in YAML format) [for validation](computable/OAS/ehr-validation.openapi.yaml), or [for code generators](computable/OAS/ehr-codegen.openapi.yaml). Users are encouraged to comment on and/or advise on these paragraphs as well as the main content.  The development version of this document can be found at <https://specifications.openehr.org/releases/ITS-REST/latest/ehr.html>.  ### Feedback  Feedback may be provided on the [Implementation Technology Specifications forum](https://discourse.openehr.org/c/specifications/its/41).  Issues may be raised on the [specifications Problem Report tracker](https://openehr.atlassian.net/browse/SPECPR).  To see changes made due to previously reported issues, see the [ITS component Change Request tracker](https://specifications.openehr.org/components/ITS/history).  ### Conformance  tbd.    # noqa: E501

    OpenAPI spec version: latest
    Contact: info@openehr.org
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from swagger_client.api_client import ApiClient


class EHRSTATUSApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def ehr_status_get_at_time(self, ehr_id, **kwargs):  # noqa: E501
        """Get EHR_STATUS at time  # noqa: E501

        Retrieves a version of the EHR_STATUS associated with the EHR identified by `ehr_id`.  If `version_at_time` is supplied, retrieves the version extant _at specified time_, otherwise retrieves the _latest_ EHR_STATUS version.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.ehr_status_get_at_time(ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str version_at_time: A given time in the extended ISO 8601 format. 
        :return: EhrStatus
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.ehr_status_get_at_time_with_http_info(ehr_id, **kwargs)  # noqa: E501
        else:
            (data) = self.ehr_status_get_at_time_with_http_info(ehr_id, **kwargs)  # noqa: E501
            return data

    def ehr_status_get_at_time_with_http_info(self, ehr_id, **kwargs):  # noqa: E501
        """Get EHR_STATUS at time  # noqa: E501

        Retrieves a version of the EHR_STATUS associated with the EHR identified by `ehr_id`.  If `version_at_time` is supplied, retrieves the version extant _at specified time_, otherwise retrieves the _latest_ EHR_STATUS version.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.ehr_status_get_at_time_with_http_info(ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str version_at_time: A given time in the extended ISO 8601 format. 
        :return: EhrStatus
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ehr_id', 'version_at_time']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method ehr_status_get_at_time" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ehr_id' is set
        if ('ehr_id' not in params or
                params['ehr_id'] is None):
            raise ValueError("Missing the required parameter `ehr_id` when calling `ehr_status_get_at_time`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'ehr_id' in params:
            path_params['ehr_id'] = params['ehr_id']  # noqa: E501

        query_params = []
        if 'version_at_time' in params:
            query_params.append(('version_at_time', params['version_at_time']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/ehr/{ehr_id}/ehr_status', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='EhrStatus',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def ehr_status_get_by_version_id(self, ehr_id, version_uid, **kwargs):  # noqa: E501
        """Get EHR_STATUS by version id  # noqa: E501

        Retrieves a particular version of the EHR_STATUS identified by `version_uid` and associated with the EHR identified by `ehr_id`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.ehr_status_get_by_version_id(ehr_id, version_uid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str version_uid: VERSION identifier taken from VERSION.uid.value.  (required)
        :return: EhrStatus
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.ehr_status_get_by_version_id_with_http_info(ehr_id, version_uid, **kwargs)  # noqa: E501
        else:
            (data) = self.ehr_status_get_by_version_id_with_http_info(ehr_id, version_uid, **kwargs)  # noqa: E501
            return data

    def ehr_status_get_by_version_id_with_http_info(self, ehr_id, version_uid, **kwargs):  # noqa: E501
        """Get EHR_STATUS by version id  # noqa: E501

        Retrieves a particular version of the EHR_STATUS identified by `version_uid` and associated with the EHR identified by `ehr_id`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.ehr_status_get_by_version_id_with_http_info(ehr_id, version_uid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str version_uid: VERSION identifier taken from VERSION.uid.value.  (required)
        :return: EhrStatus
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ehr_id', 'version_uid']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method ehr_status_get_by_version_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ehr_id' is set
        if ('ehr_id' not in params or
                params['ehr_id'] is None):
            raise ValueError("Missing the required parameter `ehr_id` when calling `ehr_status_get_by_version_id`")  # noqa: E501
        # verify the required parameter 'version_uid' is set
        if ('version_uid' not in params or
                params['version_uid'] is None):
            raise ValueError("Missing the required parameter `version_uid` when calling `ehr_status_get_by_version_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'ehr_id' in params:
            path_params['ehr_id'] = params['ehr_id']  # noqa: E501
        if 'version_uid' in params:
            path_params['version_uid'] = params['version_uid']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/ehr/{ehr_id}/ehr_status/{version_uid}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='EhrStatus',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def ehr_status_update(self, body, if_match, ehr_id, **kwargs):  # noqa: E501
        """Update EHR_STATUS  # noqa: E501

        Updates EHR_STATUS associated with the EHR identified by `ehr_id`.  The existing latest `version_uid` of EHR_STATUS resource (i.e. the `preceding_version_uid`) must be specified in the `If-Match` header.  The response will contain the updated EHR_STATUS resource when the `Prefer` header has a value of `return=representation`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.ehr_status_update(body, if_match, ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param EhrStatus body: The new EHR_STATUS.
 (required)
        :param str if_match: Header to make the request conditional.  Together with `ETag` request tag, it helps to prevent simultaneous updates of a resource from overwriting each other (\"mid-air collisions\"). The format is always an `version_uid` identifier enclosed by double quotes. The operation will be performed only if the existing latest `version_uid` of the resource (i.e. the `preceding_version_uid`) matches this header's value.  (required)
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str prefer: Request header to indicate the preference over response details. The response will contain the entire resource when the `Prefer` header has a value of `return=representation`. 
        :return: EhrStatus
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.ehr_status_update_with_http_info(body, if_match, ehr_id, **kwargs)  # noqa: E501
        else:
            (data) = self.ehr_status_update_with_http_info(body, if_match, ehr_id, **kwargs)  # noqa: E501
            return data

    def ehr_status_update_with_http_info(self, body, if_match, ehr_id, **kwargs):  # noqa: E501
        """Update EHR_STATUS  # noqa: E501

        Updates EHR_STATUS associated with the EHR identified by `ehr_id`.  The existing latest `version_uid` of EHR_STATUS resource (i.e. the `preceding_version_uid`) must be specified in the `If-Match` header.  The response will contain the updated EHR_STATUS resource when the `Prefer` header has a value of `return=representation`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.ehr_status_update_with_http_info(body, if_match, ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param EhrStatus body: The new EHR_STATUS.
 (required)
        :param str if_match: Header to make the request conditional.  Together with `ETag` request tag, it helps to prevent simultaneous updates of a resource from overwriting each other (\"mid-air collisions\"). The format is always an `version_uid` identifier enclosed by double quotes. The operation will be performed only if the existing latest `version_uid` of the resource (i.e. the `preceding_version_uid`) matches this header's value.  (required)
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str prefer: Request header to indicate the preference over response details. The response will contain the entire resource when the `Prefer` header has a value of `return=representation`. 
        :return: EhrStatus
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['body', 'if_match', 'ehr_id', 'prefer']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method ehr_status_update" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'body' is set
        if ('body' not in params or
                params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `ehr_status_update`")  # noqa: E501
        # verify the required parameter 'if_match' is set
        if ('if_match' not in params or
                params['if_match'] is None):
            raise ValueError("Missing the required parameter `if_match` when calling `ehr_status_update`")  # noqa: E501
        # verify the required parameter 'ehr_id' is set
        if ('ehr_id' not in params or
                params['ehr_id'] is None):
            raise ValueError("Missing the required parameter `ehr_id` when calling `ehr_status_update`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'ehr_id' in params:
            path_params['ehr_id'] = params['ehr_id']  # noqa: E501

        query_params = []

        header_params = {}
        if 'if_match' in params:
            header_params['If-Match'] = params['if_match']  # noqa: E501
        if 'prefer' in params:
            header_params['Prefer'] = params['prefer']  # noqa: E501

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/ehr/{ehr_id}/ehr_status', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='EhrStatus',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def versioned_ehr_status_get(self, ehr_id, **kwargs):  # noqa: E501
        """Get versioned EHR_STATUS  # noqa: E501

        Retrieves a VERSIONED_EHR_STATUS associated with an EHR identified by `ehr_id`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.versioned_ehr_status_get(ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :return: VersionedEhrStatus
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.versioned_ehr_status_get_with_http_info(ehr_id, **kwargs)  # noqa: E501
        else:
            (data) = self.versioned_ehr_status_get_with_http_info(ehr_id, **kwargs)  # noqa: E501
            return data

    def versioned_ehr_status_get_with_http_info(self, ehr_id, **kwargs):  # noqa: E501
        """Get versioned EHR_STATUS  # noqa: E501

        Retrieves a VERSIONED_EHR_STATUS associated with an EHR identified by `ehr_id`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.versioned_ehr_status_get_with_http_info(ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :return: VersionedEhrStatus
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ehr_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method versioned_ehr_status_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ehr_id' is set
        if ('ehr_id' not in params or
                params['ehr_id'] is None):
            raise ValueError("Missing the required parameter `ehr_id` when calling `versioned_ehr_status_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'ehr_id' in params:
            path_params['ehr_id'] = params['ehr_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/ehr/{ehr_id}/versioned_ehr_status', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='VersionedEhrStatus',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def versioned_ehr_status_revision_history(self, ehr_id, **kwargs):  # noqa: E501
        """Get versioned EHR_STATUS revision history  # noqa: E501

        Retrieves revision history of the VERSIONED_EHR_STATUS associated with the EHR identified by `ehr_id`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.versioned_ehr_status_revision_history(ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :return: RevisionHistory
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.versioned_ehr_status_revision_history_with_http_info(ehr_id, **kwargs)  # noqa: E501
        else:
            (data) = self.versioned_ehr_status_revision_history_with_http_info(ehr_id, **kwargs)  # noqa: E501
            return data

    def versioned_ehr_status_revision_history_with_http_info(self, ehr_id, **kwargs):  # noqa: E501
        """Get versioned EHR_STATUS revision history  # noqa: E501

        Retrieves revision history of the VERSIONED_EHR_STATUS associated with the EHR identified by `ehr_id`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.versioned_ehr_status_revision_history_with_http_info(ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :return: RevisionHistory
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ehr_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method versioned_ehr_status_revision_history" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ehr_id' is set
        if ('ehr_id' not in params or
                params['ehr_id'] is None):
            raise ValueError("Missing the required parameter `ehr_id` when calling `versioned_ehr_status_revision_history`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'ehr_id' in params:
            path_params['ehr_id'] = params['ehr_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/ehr/{ehr_id}/versioned_ehr_status/revision_history', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='RevisionHistory',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def versioned_ehr_status_version_get_at_time(self, ehr_id, **kwargs):  # noqa: E501
        """Get versioned EHR_STATUS version at time  # noqa: E501

        Retrieves a VERSION from the VERSIONED_EHR_STATUS associated with the EHR identified by `ehr_id`.  If `version_at_time` is supplied, retrieves the VERSION extant _at specified time_, otherwise retrieves the _latest_ VERSION.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.versioned_ehr_status_version_get_at_time(ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str version_at_time: A given time in the extended ISO 8601 format. 
        :return: Version
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.versioned_ehr_status_version_get_at_time_with_http_info(ehr_id, **kwargs)  # noqa: E501
        else:
            (data) = self.versioned_ehr_status_version_get_at_time_with_http_info(ehr_id, **kwargs)  # noqa: E501
            return data

    def versioned_ehr_status_version_get_at_time_with_http_info(self, ehr_id, **kwargs):  # noqa: E501
        """Get versioned EHR_STATUS version at time  # noqa: E501

        Retrieves a VERSION from the VERSIONED_EHR_STATUS associated with the EHR identified by `ehr_id`.  If `version_at_time` is supplied, retrieves the VERSION extant _at specified time_, otherwise retrieves the _latest_ VERSION.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.versioned_ehr_status_version_get_at_time_with_http_info(ehr_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str version_at_time: A given time in the extended ISO 8601 format. 
        :return: Version
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ehr_id', 'version_at_time']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method versioned_ehr_status_version_get_at_time" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ehr_id' is set
        if ('ehr_id' not in params or
                params['ehr_id'] is None):
            raise ValueError("Missing the required parameter `ehr_id` when calling `versioned_ehr_status_version_get_at_time`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'ehr_id' in params:
            path_params['ehr_id'] = params['ehr_id']  # noqa: E501

        query_params = []
        if 'version_at_time' in params:
            query_params.append(('version_at_time', params['version_at_time']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/ehr/{ehr_id}/versioned_ehr_status/version', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Version',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def versioned_ehr_status_version_get_by_id(self, ehr_id, version_uid, **kwargs):  # noqa: E501
        """Get versioned EHR_STATUS version by id  # noqa: E501

        Retrieves a VERSION identified by `version_uid` of an EHR_STATUS associated with the EHR identified by `ehr_id`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.versioned_ehr_status_version_get_by_id(ehr_id, version_uid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str version_uid: VERSION identifier taken from VERSION.uid.value.  (required)
        :return: Version
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.versioned_ehr_status_version_get_by_id_with_http_info(ehr_id, version_uid, **kwargs)  # noqa: E501
        else:
            (data) = self.versioned_ehr_status_version_get_by_id_with_http_info(ehr_id, version_uid, **kwargs)  # noqa: E501
            return data

    def versioned_ehr_status_version_get_by_id_with_http_info(self, ehr_id, version_uid, **kwargs):  # noqa: E501
        """Get versioned EHR_STATUS version by id  # noqa: E501

        Retrieves a VERSION identified by `version_uid` of an EHR_STATUS associated with the EHR identified by `ehr_id`.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.versioned_ehr_status_version_get_by_id_with_http_info(ehr_id, version_uid, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str ehr_id: EHR identifier taken from EHR.ehr_id.value.  (required)
        :param str version_uid: VERSION identifier taken from VERSION.uid.value.  (required)
        :return: Version
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ehr_id', 'version_uid']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method versioned_ehr_status_version_get_by_id" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'ehr_id' is set
        if ('ehr_id' not in params or
                params['ehr_id'] is None):
            raise ValueError("Missing the required parameter `ehr_id` when calling `versioned_ehr_status_version_get_by_id`")  # noqa: E501
        # verify the required parameter 'version_uid' is set
        if ('version_uid' not in params or
                params['version_uid'] is None):
            raise ValueError("Missing the required parameter `version_uid` when calling `versioned_ehr_status_version_get_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'ehr_id' in params:
            path_params['ehr_id'] = params['ehr_id']  # noqa: E501
        if 'version_uid' in params:
            path_params['version_uid'] = params['version_uid']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = []  # noqa: E501

        return self.api_client.call_api(
            '/ehr/{ehr_id}/versioned_ehr_status/version/{version_uid}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Version',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
