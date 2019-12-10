(function webpackUniversalModuleDefinition(root, factory) {
	if(typeof exports === 'object' && typeof module === 'object')
		module.exports = factory(require("axios"), require("iview"), require("lodash"), require("peacetrue-async-validator/dist/peace.async-validator"), require("peacetrue-iview/src/components/page-table"));
	else if(typeof define === 'function' && define.amd)
		define(["axios", "iview", "lodash", "peacetrue-async-validator/dist/peace.async-validator", "peacetrue-iview/src/components/page-table"], factory);
	else if(typeof exports === 'object')
		exports["MessageList"] = factory(require("axios"), require("iview"), require("lodash"), require("peacetrue-async-validator/dist/peace.async-validator"), require("peacetrue-iview/src/components/page-table"));
	else
		root["MessageList"] = factory(root["axios"], root["iview"], root["_"], root["Peace"]["AsyncValidator"], root["PeaceIview"]["PageTable"]);
})(this, function(__WEBPACK_EXTERNAL_MODULE_axios__, __WEBPACK_EXTERNAL_MODULE_iview_dist_iview__, __WEBPACK_EXTERNAL_MODULE_lodash__, __WEBPACK_EXTERNAL_MODULE_peacetrue_async_validator_dist_peace_async_validator__, __WEBPACK_EXTERNAL_MODULE_peacetrue_iview_dist_components_page_table__) {
return /******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = "./src/message_list.js");
/******/ })
/************************************************************************/
/******/ ({

/***/ "./node_modules/peacetrue-iview/dist/mixins/promise-confirm.js":
/*!*********************************************************************!*\
  !*** ./node_modules/peacetrue-iview/dist/mixins/promise-confirm.js ***!
  \*********************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

(function webpackUniversalModuleDefinition(root, factory) {
	if(true)
		module.exports = factory();
	else {}
})(this, function() {
return /******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = "./src/mixins/promise-confirm.js");
/******/ })
/************************************************************************/
/******/ ({

/***/ "./src/mixins/promise-confirm.js":
/*!***************************************!*\
  !*** ./src/mixins/promise-confirm.js ***!
  \***************************************/
/*! no static exports found */
/***/ (function(module, exports) {

eval("module.exports = {\n    methods: {\n        promiseConfirm(title, content) {\n            return new Promise((resolve, reject) => {\n                this.$Modal.confirm({\n                    title: title,\n                    content: content,\n                    onOk: () => {\n                        resolve();\n                    },\n                    onCancel() {\n                        reject();\n                    }\n                });\n            });\n        },\n    },\n};\n\n\n\n//# sourceURL=webpack://PeaceIview.%5Bname%5D/./src/mixins/promise-confirm.js?");

/***/ })

/******/ });
});

/***/ }),

/***/ "./src/message_list.js":
/*!*****************************!*\
  !*** ./src/message_list.js ***!
  \*****************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

let {Card, Form, FormItem, Input, Icon, Button, InputNumber, DatePicker} = __webpack_require__(/*! iview/dist/iview */ "iview/dist/iview");
let PageTable = __webpack_require__(/*! peacetrue-iview/dist/components/page-table */ "peacetrue-iview/dist/components/page-table");
let Axios = __webpack_require__(/*! axios */ "axios");
let Lodash = __webpack_require__(/*! lodash */ "lodash");
let PromiseConfirm = __webpack_require__(/*! peacetrue-iview/dist/mixins/promise-confirm */ "./node_modules/peacetrue-iview/dist/mixins/promise-confirm.js");
let {Rules, Generator, setFields} = __webpack_require__(/*! peacetrue-async-validator/dist/peace.async-validator */ "peacetrue-async-validator/dist/peace.async-validator");

module.exports = {
    name: 'MessageList',
    template: `
    <div class="message-list">
        <Card>
            <span slot="title">查询条件</span>
            <Form ref="form" :model="params" inline>
                <FormItem prop="title">
                    <Input type="text" v-model="params.title" placeholder="标题"/>
                </FormItem>
                <FormItem prop="receiverId">
                    <Input type="text" v-model="params.receiverId" placeholder="目标用户"/>
                </FormItem>
                <FormItem prop="createdTime.lowerBound">
                    <DatePicker type="date" placeholder="创建起始时间" v-model="params.createdTime.lowerBound"></DatePicker>
                </FormItem>
                <FormItem prop="createdTime.upperBound">
                    <DatePicker type="date" placeholder="创建结束时间" v-model="params.createdTime.upperBound"></DatePicker>
                </FormItem>
                <FormItem>
                    <Button type="primary" @click="query(true)">查询</Button>
                    <Button @click="reset">清空</Button>
                </FormItem>
            </Form>
        </Card>
        <Row class="operation-bar">
            <Col span="24">
<!--                <Button type="primary" size="small" @click="openAdd()">新增</Button>-->
                &nbsp;
<!--                <Button type="primary" size="small" @click="remove()">删除</Button>-->
            </Col>
        </Row>
        <Card>
            <div slot="title">查询结果</div>
            <page-table ref="pageTable" :url="url" :columns="columns" v-model="params" :success-format="successFormat"></page-table>
        </Card>
        <Modal v-model="detail.model" :title="detail.title">
            <Form ref="detail" :model="detail.data" :rules="detail.rules" :label-width="100">
                <FormItem label="标题" prop="title">
                    <i-input type="text" v-model="detail.data.title" placeholder="必填、长度1~255" :readonly="detail.readonly" :class="detail.style"></i-input>
                </FormItem>
                <FormItem label="内容" prop="content">
                    <i-input type="text" v-model="detail.data.content" placeholder="必填、长度1~1022" :readonly="detail.readonly" :class="detail.style"></i-input>
                </FormItem>
                <FormItem label="接收者类型" prop="receiverTypeCode">
                    <i-input type="text" v-model="detail.data.receiverTypeCode" placeholder="必填、长度1~255" :readonly="detail.readonly" :class="detail.style"></i-input>
                </FormItem>
                <FormItem label="接收者标识" prop="receiverId">
                    <i-input type="text" v-model="detail.data.receiverId" placeholder="必填、长度1~255" :readonly="detail.readonly" :class="detail.style"></i-input>
                </FormItem>
                <template v-if="detail.readonly">
                    <FormItem label="创建者" prop="creatorId">
                        <i-input type="text" v-model="detail.data.creatorId" :readonly="detail.readonly" :class="detail.style"></i-input>
                    </FormItem>
                    <FormItem label="创建事件" prop="createdTime">
                        <i-input type="text" v-model="detail.data.createdTime" :readonly="detail.readonly" :class="detail.style"></i-input>
                    </FormItem>
                </template>                                                                                                  
            </Form>
            <div slot="footer" v-show="!detail.readonly">
                <i-button type="success" size="large" long :loading="detail.loading" @click="save">提交</i-button>
            </div>  
        </Modal>      
    </div>
    `,
    props: {
        url: {type: String, required: false, default: '/messages'},
        uniqueUrl: {type: String, required: false, default: '/common/messages/unique'},
        params: {type: Object, required: false, default() {return {page: 0, size: 10, title: null, name: null, createdTime: {lowerBound: null, upperBound: null}};}},
        successFormat: {type: Function, required: false, default(data) {return data;}},
        columns: {
            type: Array, required: false, default() {
                return [
                    {type: 'selection', width: 60, align: 'center'},
                    {title: '目标用户', key: 'receiverId', width: 120, render: (h, p) => h('span', p.row.receiverId || p.row.receiverTypeCode)},
                    {title: '标题', key: 'title', width: 200, tooltip: true},
                    {title: '内容', key: 'content', tooltip: true},
                    {title: '到达数', key: 'receivedCount', width: 120},
                    {title: '创建人', key: 'creatorId', width: 130,},
                    {title: '创建时间', key: 'createdTime', width: 200, tooltip: true, sortable: 'custom'},
                    // {title: '操作', width: 200, fixed: 'right', render: (h, r) => {return this.renderOperate(h, r);}},
                ];
            }
        },
    },
    data() {
        setFields({title: "标题", content: "内容"});
        return {
            detail: {
                model: false,
                loading: false,
                data: {},
                readonly: false,
                style: null,
                rules: Generator.generate({
                    title: [{required: true}, {max: 255}],
                    content: [{required: true}, {max: 1022}],
                })
            },
        };
    },
    methods: {
        query(reset) {
            this.$refs.pageTable.query(reset);
        },
        renderOperate(h, r) {
            let buttons = [
                h(Button, {props: {type: 'primary', size: 'small'}, on: {click: () => this.openView(r.row)}}, '查看'),
                " ",
                h(Button, {props: {type: 'primary', size: 'small'}, on: {click: () => this.openModify(r.row)}}, '修改'),
                " ",
                h(Button, {props: {type: 'primary', size: 'small'}, on: {click: () => this.remove(r.row)}}, '删除'),
            ];
            return h('div', buttons);
        },
        reset() {
            this.$refs.form.resetFields();
            return this.query(true);
        },
        save() {},
        openView(row) {
            this.detail.model = true;
            this.detail.title = '查看示例';
            this.detail.data = row;
            // this.detail.rules.title[2].unique.original = row.title;
            this.detail.readonly = true;
            this.detail.style = 'readonly';
        },
        openAdd() {
            this.detail.model = true;
            this.detail.title = '创建示例';
            this.detail.data = {};
            this.detail.readonly = false;
            this.detail.style = null;
            // this.detail.rules.title[2].unique.original = null;
            this.$refs.form.resetFields();
            this.save = this.add;
        },
        add() {
            this.$refs.detail.validate((valid) => {
                if (!valid) return;
                this.promiseConfirm('确认要创建示例么？').then(() => {
                    this.detail.loading = true;
                    let params = Lodash.cloneDeep(this.detail.data);
                    Axios.post(this.url, params)
                        .then(t => {
                            this.detail.model = false;
                            this.query(true);
                        })
                        .finally(t => this.detail.loading = false);
                });
            });
        },
        openModify(row) {
            this.detail.model = true;
            this.detail.title = '修改示例';
            this.detail.data = Lodash.merge({}, row);
            this.detail.readonly = false;
            this.detail.style = null;
            // this.detail.rules.title[2].unique.original = row.title;
            this.$refs.form.resetFields();
            this.save = this.modify;
        },
        modify() {
            this.$refs.detail.validate((valid) => {
                if (!valid) return;
                this.promiseConfirm('确认要修改么？').then(() => {
                    this.detail.loading = true;
                    let params = Lodash.cloneDeep(this.detail.data);
                    Axios.put(this.url, params)
                        .then(t => {
                            this.detail.model = false;
                            this.query(true);
                        })
                        .finally(t => this.detail.loading = false);

                });
            });
        },
        remove(row) {
            if (row) {
                row = [row];
            } else {
                let selection = this.$refs.pageTable.selection;
                if (selection.length === 0) return this.$Message.warning('尚未选中任何记录!');
                row = selection;
            }
            this.promiseConfirm('确认要删除么？').then(() => {
                Axios.delete(`${this.url}?${row.map(t => 'id=' + t.id).join('&')}`).then(t => {
                    this.query(true);
                });
            })
        },
    },
    components: {
        Card, Form, FormItem, Input, Icon, Button, InputNumber, DatePicker, PageTable
    },
    mixins: [PromiseConfirm]
};



/***/ }),

/***/ "axios":
/*!************************!*\
  !*** external "axios" ***!
  \************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = __WEBPACK_EXTERNAL_MODULE_axios__;

/***/ }),

/***/ "iview/dist/iview":
/*!************************!*\
  !*** external "iview" ***!
  \************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = __WEBPACK_EXTERNAL_MODULE_iview_dist_iview__;

/***/ }),

/***/ "lodash":
/*!*************************************************************************************!*\
  !*** external {"root":"_","commonjs":"lodash","commonjs2":"lodash","amd":"lodash"} ***!
  \*************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = __WEBPACK_EXTERNAL_MODULE_lodash__;

/***/ }),

/***/ "peacetrue-async-validator/dist/peace.async-validator":
/*!******************************************************************************************************************************************************************************************************************************************************!*\
  !*** external {"root":["Peace","AsyncValidator"],"commonjs":"peacetrue-async-validator/dist/peace.async-validator","commonjs2":"peacetrue-async-validator/dist/peace.async-validator","amd":"peacetrue-async-validator/dist/peace.async-validator"} ***!
  \******************************************************************************************************************************************************************************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = __WEBPACK_EXTERNAL_MODULE_peacetrue_async_validator_dist_peace_async_validator__;

/***/ }),

/***/ "peacetrue-iview/dist/components/page-table":
/*!*********************************************************************************************************************************************************************************************************************!*\
  !*** external {"root":["PeaceIview","PageTable"],"commonjs":"peacetrue-iview/src/components/page-table","commonjs2":"peacetrue-iview/src/components/page-table","amd":"peacetrue-iview/src/components/page-table"} ***!
  \*********************************************************************************************************************************************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = __WEBPACK_EXTERNAL_MODULE_peacetrue_iview_dist_components_page_table__;

/***/ })

/******/ });
});
//# sourceMappingURL=message_list.js.map