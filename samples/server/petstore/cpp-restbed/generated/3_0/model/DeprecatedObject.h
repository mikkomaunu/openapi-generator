/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.15.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * DeprecatedObject.h
 *
 * 
 */

#ifndef DeprecatedObject_H_
#define DeprecatedObject_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  DeprecatedObject 
{
public:
    DeprecatedObject() = default;
    explicit DeprecatedObject(boost::property_tree::ptree const& pt);
    virtual ~DeprecatedObject() = default;

    DeprecatedObject(const DeprecatedObject& other) = default; // copy constructor
    DeprecatedObject(DeprecatedObject&& other) noexcept = default; // move constructor

    DeprecatedObject& operator=(const DeprecatedObject& other) = default; // copy assignment
    DeprecatedObject& operator=(DeprecatedObject&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// DeprecatedObject members

    /// <summary>
    /// 
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

protected:
    std::string m_Name = "";
};

std::vector<DeprecatedObject> createDeprecatedObjectVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<DeprecatedObject>(const DeprecatedObject& val) {
    return val.toPropertyTree();
}

template<>
inline DeprecatedObject fromPt<DeprecatedObject>(const boost::property_tree::ptree& pt) {
    DeprecatedObject ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* DeprecatedObject_H_ */
